#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,a;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
    a=(i*i)-2;
      cout<<a<<" ";
    }
    else{
    
     a=(i*i)-1;
      cout<<a<<" ";
    }
    
     
  }
}