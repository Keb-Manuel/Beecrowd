main:: IO ()
main = do
    input1 <-getLine
    let num1 = read input1:: Int
    input2 <- getLine
    let num2 = read input2:: Int
    let suma = num1 + num2
    putStrLn $ "X = " ++ show suma