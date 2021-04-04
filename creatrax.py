def calcTotalTax(arr,n):
    k=[]
    for i in arr:
        if(i>=100):
            f=int(.1*(i-100)+i)
            k.append(f)
        else:
            f=int(i)
            k.append(f)
    print(sum(k)-sum(arr))
 
 
#TO USE UNCOOMENT THIS CASE 1 and comment case 2
#CASE 1    
#TESTING
# n=5
# arr=[1000,2000,3000,4000,5000]

#TO USE UNCOOMENT THIS CASE 2 and comment case 1
#CASE 1   
#FROM USER
n=input("ENTER size of tax ")
arr=list(map(int,input().split()))
calcTotalTax(arr,n)
