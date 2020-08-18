#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x>>y;
  int a=(y-4)*(y-4);
  int b=(x-3)*(x-3);
  int c=a+b;
  int d=sqrt(c);
  cout<<d;
}