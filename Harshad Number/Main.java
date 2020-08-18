#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,sum=0,b;
  cin>>n;
  b=n;
  while(n!=0)
  {
     a=n%10;
    
    sum=sum+a;
    n=n/10;
  }
  if(b%sum==0)
  {
     cout<<"Harshad Number";
  }
  else{
     cout<<"Not Harshad Number";
  }
  
  
}