#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,c=0,a;
   cin>>n;
   while(n!=0)
   {
      a=n%10;
     c=c+a;
     n=n/10;
   }
    cout << c;
    
}