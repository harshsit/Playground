#include<iostream>
using namespace std;
int main()
{
   int a,b,c,d,min,e;
  cin>>a>>b>>c>>d;
  if(a<b&&a<c)
  {
    min=a;
    
  
  }
  else if(b<c)
  {
    min=b;
  }
  else{
    min=c;
  
  }
  while(min>=1)
  {
  if(a%min==0&&b%min==0&&c%min==0)
  {
    
     e=min;
    break;
  }
  min--;
  
  
  }
  if(min==d)
  {
     cout<<"Answer is correct.";
  
  }
  else{
  cout<<"Answer is wrong.";
  }

}