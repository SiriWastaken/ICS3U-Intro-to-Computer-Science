.section .data
.equ BUFFER_SIZE, 64

.section .bss
.lcomm input_buf, 64
.lcomm output_buf, 32

.section .text
.globl _start

_start:
    movq $0, %rax
    movq $0, %rdi
    lea input_buf(%rip), %rsi
    movq $BUFFER_SIZE, %rdx
    syscall

    movq %rax, %r12
    lea input_buf(%rip), %r13
    xorq %r14, %r14

    call parse_int
    movq %rax, %r8

    call parse_int
    movq %rax, %r9

    call parse_int
    movq %rax, %r10

    addq %r9, %r8
    addq %r10, %r8
    
    movq %r8, %rax
    movq $3, %rcx
    cqto
    idivq %rcx

    lea output_buf(%rip), %rdi
    call int_to_string
    movq %rax, %rdx

    movq $1, %rax
    movq $1, %rdi
    lea output_buf(%rip), %rsi
    syscall

    movq $60, %rax
    xorq %rdi, %rdi
    syscall

parse_int:
    xorq %rax, %rax
    xorq %rcx, %rcx

.Lskip_spaces:
    cmpq %r12, %r14
    jge .Lparse_done
    movzbq (%r13), %rdx
    cmpb $32, %dl
    je .Lnext_char
    cmpb $10, %dl
    je .Lnext_char
    jmp .Lcheck_sign

.Lnext_char:
    incq %r13
    incq %r14
    jmp .Lskip_spaces

.Lcheck_sign:
    cmpb $45, %dl
    jne .Lparse_loop
    movq $1, %rcx
    incq %r13
    incq %r14

.Lparse_loop:
    cmpq %r12, %r14
    jge .Lparse_done
    movzbq (%r13), %rdx
    cmpb $48, %dl
    jl .Lparse_done
    cmpb $57, %dl
    jg .Lparse_done
    
    subb $48, %dl
    imulq $10, %rax
    addq %rdx, %rax
    
    incq %r13
    incq %r14
    jmp .Lparse_loop

.Lparse_done:
    testq %rcx, %rcx
    jz .Lparse_ret
    negq %rax
.Lparse_ret:
    ret

int_to_string:
    pushq %rbx
    movq %rdi, %r8
    xorq %rcx, %rcx
    
    testq %rax, %rax
    jns .Lpos_convert
    negq %rax
    movb $45, (%rdi)
    incq %rdi

.Lpos_convert:
    movq $10, %rbx

.Lloop_digits:
    xorq %rdx, %rdx
    divq %rbx
    addb $48, %dl
    pushq %rdx
    incq %rcx
    testq %rax, %rax
    jnz .Lloop_digits

.Lpop_digits:
    popq %rdx
    movb %dl, (%rdi)
    incq %rdi
    loop .Lpop_digits

    movb $10, (%rdi)
    incq %rdi

    movq %rdi, %rax
    subq %r8, %rax
    popq %rbx
    ret