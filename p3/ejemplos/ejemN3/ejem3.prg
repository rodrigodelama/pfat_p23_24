pf2024 EjemN3

decl

intset a, b, c, d;
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

numElem:=card(c);
i:=0;

while card(c)>0 and i>-1 do 
  elem:= lowest_elem(c);
  printInt(i);
  printInt(elem);
  numElem:=numElem - 1;
  c:= c - { elem };
  if not (numElem=card(c))
  then
    i:=-1;
  else
    i:=i + 1;
  end;
end;

end;
