
module Recursive = 

    let rec fibo n =
        if n = 0 then 0 
        else if n = 1 then 1
        else if n = 2 then 1
        else fibo (n-1) + fibo (n-2) + fibo (n-3)

    let nums = [0..8]
    printfn "%A" (List.map fibo nums)

