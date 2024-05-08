pf2024 EjemN1

decl

intset a, b, c, d;
int a1,b1,c1,d1;

begin
a:= {0, 1, 3, 5, 7, 9};
b:= {0, 2, 4, 6, 8};
c:= a union b;
d:= a intersec cero;
a1:= card(a);
printInt(a1);
b1:= card(b);
printInt(b1);
c1:= card(c);
printInt(c1);
d1:= card(d);
printInt(d1);
end;
