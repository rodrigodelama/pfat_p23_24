pf2024 Ejem6

decl

intset a, b, c, d, e;
int a1, b1, c1, d1, e1;

int i, sig;

begin
a:= {0, 1, 3, 5, -2, 7, 9, 4};
b:= {0, -2, 4, -6, 8, 10};
c:= a union b;
d:= a intersec b;
e:= a - b;
a1:= card(a);
printInt(a1);
b1:= card(b);
printInt(b1);
c1:= card(c);
printInt(c1);
d1:= card(d);
printInt(d1);
e1:= card(e);
printInt(e1);

i:=0;

while not (e = emptyset) do
  sig:=lowest_elem(e);
  printInt(i);
  printInt(sig);
  i:= i + 1;
  e:= e - {sig};
end;

end;
