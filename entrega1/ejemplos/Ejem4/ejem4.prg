pf2024 Ejem4

decl

intset a, b, c, d, e;
int a1, b1, c1, d1;

int numElem, elem, i;

begin
a:= {0, 1, 3, 5, 7, 9};
b:= {0, 2, 4, 6, 8};
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

e:= { };

while (i<100) do
  e:= e union {2 * i + 1};
  if (i > 80) or ((i/4)*4=i)
  then e:=e union {i};
  end;
  i:= i + 1;
end;

i:=0;

e:= e union b;

while card(e)>0 do 
  elem:= lowest_elem(e);
  printInt(i);
  printInt(elem);
  i:=i + 1;
  e:= e - { elem };
end;

end;
