import sys

d = {
    0: 0,
    1: 1,
    2: 1,
}

fibo = lambda x: d[x] if x <= 2 else fibo(x-2) + fibo(x-1) + fibo(x-3)

if __name__ == '__main__':
    print([fibo(n) for n in range(int(sys.argv[1]))])
