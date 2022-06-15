

let fib = (\x -> case x of {0 -> 0; 1 -> 1; 2 -> 1; n -> fib(n-1) + fib(n-2) + fib(n-3)})
(\y -> map fib ((\x -> [0..x]) y)) 9

-- [0,1,1,2,4,7,13,24,44,81]
