#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int a,c=0,e=0;
    //Your code goes here
  int d=n;
  int f=n;
  while(n!=0)
  {
     
    n=n/10;
    c++;
  }
  while(d!=0)
  {
     a=d%10;
    d=d/10;
     e=e+power(a,c);
  }
  if(e==f)
  return 1;
  else
    return 0;
    
  
  
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}