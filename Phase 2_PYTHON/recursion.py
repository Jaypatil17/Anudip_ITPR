# #simple example
# def show(n):
#     if(n==0):
#         return 
#     print(n)
#     show(n-1)
# show(5)

# #facotial number with recursion

# def fact(n):
#     if(n==0 or n==1):
#         return 1
#     return n * fact(n-1)
# print(fact(5))

# #recursion for sum of n natural numbers

# def sum(n):
#     if(n==0):
#         return 0
#     return sum(n-1)+n
# print(sum(10))

#recursion for print list

list=[1,2,3,4,5]
def print_list(list,idx=0):
    if(idx== len(list)):
        return
    print(list[idx])
    print_list(list,idx+1)
print_list(list)