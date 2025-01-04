; Module Declaration
@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1

declare i32 @printf(i8*, ...)

define i32 @main() {
    
    %a = alloca i32
    %b = alloca i32
    %result = alloca i32

    
    store i32 3, i32* %a     ; a = 3
    store i32 4, i32* %b     ; b = 4

    
    %val_a = load i32, i32* %a
    %val_b = load i32, i32* %b

    
    %cmp = icmp eq i32 %val_a, %val_b   

    
    br i1 %cmp, label %if_true, label %if_false

if_true:
    
    store i32 7, i32* %result   ; result = 7
    br label %end_if

if_false:
    
    store i32 5, i32* %result   ; result = 5
    br label %end_if

end_if:
    
    %final_result = load i32, i32* %result

    
    %print_result = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.str, i32 0, i32 0), i32 %final_result)

    
    ret i32 0
}
