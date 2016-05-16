#ifndef _objects.h_
#define _objects.h_

#include <windows.h>
#include <windowsx.h>
#include <stdio.h>
using namespace std;

#define ID_TIMER 101
#define IDI_ICON 102



class objects
{

protected:
    COLORREF clr;
public:
    POINT center;
    int xSpeed,ySpeed;
    int counter=0;

    objects(POINT center,const int &speed);
    bool Accelerate(const int& deltaSpeedX, const int& deltaSpeedY);
    bool Color(const COLORREF &clr);
    bool Collision(const RECT &rect);
    bool Shape(objects &ob);
    virtual bool Move(const HDC &hdc, const RECT& rect,HBRUSH &hBrush) = 0;
};

class Circle : public objects {
public:
    Circle(POINT center,const int &speed): objects(center,speed){}
    bool Move(const HDC &hdc,const RECT& rect,HBRUSH &hBrush);
};

bool Interaction(objects &obj1, objects &obj2);
#endif
