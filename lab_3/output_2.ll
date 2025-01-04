; Module Declaration
@.str = private unnamed_addr constant [2 x i8] c"7\00"

declare i32 @printf(i8*, ...)

define i32 @main() {
    ; Вызов printf
    %call = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str, i32 0, i32 0))
    ret i32 0
}

