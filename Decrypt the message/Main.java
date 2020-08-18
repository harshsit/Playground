#include<iostream>
using namespace std;
int main()
{

   int e,t,a,i,sum=0;
  cin>>e>>t;
  a=e+t;
  for(i=1;i<a;i++)
  {
     if(a%i==0)
     {
        sum=sum+i;
     }
  }
  if(sum==a)
  {
     cout<<"They can read the message";
  }
  else{
     cout<<"They can't read the message";
  }

}