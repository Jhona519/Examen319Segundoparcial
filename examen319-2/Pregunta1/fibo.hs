import System.Environment

main = do
    num <- getArgs
    let x = read (head num) :: Int
    print $ map fibonacci [0..x-1]

fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci 2 = 1
fibonacci x = fibonacci(x-1) + fibonacci(x-2) +fibonacci(x-3)
