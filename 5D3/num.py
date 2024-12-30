 def prime_range(s,e):
    for val in range(e,s+1):
        if prime(val):
               print(val)
prime_range(1,100)
