pf2024 Ejem5

decl

intset a, b, c, d, e;
int a1, b1, c1, d1;

int numElem, elem, i;

begin
a:= {0, 1, 3, 5, 7, 9};
b:= {0, -2, 4, -6, 82};
c:= a union b;
d:= a intersec b;
a1:= card(a);
printInt(a1);
b1:= card(b);
printInt(b1);
c1:= card(c);
printInt(c1);
d1:= card(d);
printInt(d1);

i:=0;

e:= emptyset;

while (i<100) do
  e:= e union {2 * i + 1};
  i:=i + 1;
end;

i:=-10;

e:= e union b;

while (i<250) do 
  if i in e
  then
    printInt(i);
  end;
  i:=i + 1;
end;

end;
