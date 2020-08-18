#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c,a;
  cin>>b>>c;
  
  if(b>c)
  {
     b=100-b;
    a=b+c;
    cout<<a;
  }
  else{
     b=c-b;
    cout<<b;
  }
}