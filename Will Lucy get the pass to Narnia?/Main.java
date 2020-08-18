#include<iostream>
using namespace std;
int main()
{
  
  int a,b,x,c=0;
  cin>>a>>b>>x;
  
  cout<<"Enter first number : Enter second number : Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  
  
    
    switch(x)
    {
        case 1 : c=a+b;
        
        
        cout<<c;
        break;
        case 2 : 
        c=a-b;
        cout<<c;
        break;
        case 3 : 
        c=a*b;
        cout<<c;
        break;
      case 4: c=a/b;
        cout<<c;
        break;
      case 5: c=a%b;
        cout<<c;
        break;
        default : cout<<"Invalid operation";
        break;
    }
}