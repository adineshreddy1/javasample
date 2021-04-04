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
    # num = input ("Enter number :")
n=input("ENTER size of tax ")
arr=list(map(int,input().split()))
calcTotalTax(arr,n)
