#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  
   int n,a,b;
  cin>>n;
  while(n!=0)
        {
          
          a=n%10;
          n=n/10;
    cout<<a;
         
        }
	return 0;
}