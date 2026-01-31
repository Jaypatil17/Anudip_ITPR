# break and continue keyword

i=1
while i<=10:
       if(i==5):
         print(i)
         break
       print(i)
       i+=1

print("\n")

i=1
while i<=10:
   if(i==5):
       i+=1
       continue
   print(i)
   i+=1

