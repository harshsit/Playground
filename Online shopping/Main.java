#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int fl=a-((b*a)/100)+c;
  int s=d-((e*d)/100)+f;
  int am=g-((h*g)/100)+i;
  cout<<"In Flipkart Rs."<<fl<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<am<<endl;
  if(fl<=s&&fl<=am)
    
  {
    
  cout<<"He will prefer Flipkart";
  }
  else if(s<=am)
  {
  cout<<"He will prefer Snapdeal";
  
  }
  else{
  cout<<"He will prefer Amazon";
  }
}