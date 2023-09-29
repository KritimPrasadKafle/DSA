if __name__ == '__main__':
    N = 123
    num = N
    reverse = 0
    while N != 0:
        digit = N % 10
        reverse = reverse * 10 + digit
        N = N // 10
    print("The reverse of the {} is {}".format(num, reverse))
