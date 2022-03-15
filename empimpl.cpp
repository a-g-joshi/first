using namespace std;
#include<iostream>
#include"emp.h"

Employee::Employee()
{
    this->id=1;
    this->sal=50000;
}

Employee::Employee(int id,int sal)
{
   this->id=id;
   this->sal=sal;
}

void Employee::accept()
{
    cout<<"Enter Id :";
    cin>>this->id;

    cout<<"enter sal :";
    cin>>this->sal;
}

void Employee::disp()
{
    cout<<"Id is: "<<this->id<<endl;

    cout<<"\nsal is: "<<this->sal;
}