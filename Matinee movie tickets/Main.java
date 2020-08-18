#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int a;
  float t;
  cin>>a>>t;
  if((t<12)&&(a>13)){
    double p=8.00;
    cout<<"$"<<p<<".00";
  }
  else if((t>12)&&(a>13))
  {
    
    double p=5.00;
    cout<<"$"<<p<<".00";}
  else if((t<12)&&(a<13)){
     float p=4.00;
    cout<<"$"<<p<<".00";
  }
  else if((t>12)&&(a<13))
  {
    
    float p=2.00;
    cout<<"$"<<p<<".00";}
    
}