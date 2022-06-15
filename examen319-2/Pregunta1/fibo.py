import sys


def fibo(n):
    if n ==0:
        return 0
    elif n ==1:
        return 1
    elif n ==2:
        return 1
    else:
        fib = fibo(n-2) + fibo(n-1) + fibo(n-3)
        return fib


if __name__ == '__main__':
    print([fibo(n) for n in range(int(sys.argv[1]))])
