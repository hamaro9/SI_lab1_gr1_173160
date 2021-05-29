Link: https://github.com/hamaro9/SI_lab1_gr1_173160
________________________________________________________________________________
Site iskoristeni komandi:

1. 1. git clone https://github.com/finkiSI/SI_lab1_gr1.git SI_lab1_gr1_173160

	1.1 Vo ovoj cekor go klonirame repozitoriumot i mu go davame imeto SI_lab1_gr1_173160

2. 1. git remote rm origin

	2.1 So ova go briseme remote repo sto e linkuvano so lokalnoto

3. 1. git remote add origin https://github.com/hamaro9/SI_lab1_gr1_173160
   2. git push -u origin master

	3.1 & 3.2 So ovie komandi gi linkuvame i sihronizirame remote repo-to so local repo

4. 1. nano students.csv

	4.1 Kreirame tekstualen dokument koj ima 5 reda so slednive informacii i vo ovoj format:
	    indeks, ime, prezime

5. 1. git add students.csv
   2. git commit -m "students.csv added"
   3. git push

	Prethodno konfigurirav mojot mail i ime za da mozam da gi napravam komandite.	
	5.1 Ja pravime promenata vo local repo, zapisuvanje na fileot students.csv 
	5.2 So ovaa komanda se zacuvuvaat/snimaat promenite sto sme gi napravile. Ja zapisuvame i porakata "students.csv added"
	5.3 So ova pravime log na promenata, odnosno sihronizirame so remote

6. 1. git add Student.java
   2. git commit -m "lab points variable added"
   3. git push

	6.1 Go zapisuvame fileot Student.java, se pravi pred da napravime git commit
	6.2 Ja pravime promenata so porakata "lab points variable added"
	6.3 Pravime log na promenata, sihronizirame so remote

7. 1. git add Student.java
   2. git commit -m "student class finished"
   3. git push

	7.1 Istoto kako vo prethodnite cekori
	7.2 Istoto kako vo prethodnite cekori
	7.3 Istoto kako vo prethodnite cekori

8. 1. git checkout -b courseFeature
   2. git push origin courseFeature

	8.1 Kreirame nov branch (so parametarot -b) i se "prefrlame" vo toj branch
	8.2 Go dodavame branchot vo remote repository

9. 1. git add Course.java
   2. git add students.csv
   3. git commit -m "Updated students.csv file & added Course.java file"
   4. git push --set-upstream origin courseFeature

   	9.1 Istoto kako vo prethodnite cekori
	9.2 Istoto kako vo prethodnite cekori
	9.3 Istoto kako vo prethodnite cekori
	9.4 koga napraviv git push mi pokaza error,
   	fatal: The current branch courseFeature has no upstream branch.
   	To push the current branch and set the remote as upstream, use
      	git push --set-upstream origin courseFeature

10. 1. git checkout master 
    2. git merge courseFeature

	10.1 Ovaa komanda ja koristime za da vlezeme vo master
	10.2 Ovaa komanda ja koristime za da go mergeneme courseFeature branch-ot vo master

11. 1. git push
	
	11.1 Ja stavame sodrzinata na lokalniot repo vo remote repo
_______________________________________________________________________________________________________
Logs:
commit 63eea075f45325211004439a11f7fe548f58ff50 (HEAD -> master, origin/master, origin/courseFeature, courseFeature)
Author: Amar <amarhadziahmetovik@live.com>
Date:   Sat Apr 11 18:08:51 2020 +0200

    Updated students.csv file & added Courses.java file

commit 708cb989718d96a25e5fdb02322d0061a74d51d0
Author: Amar <amarhadziahmetovik@live.com>
Date:   Sat Apr 11 17:49:45 2020 +0200

    student class finished

commit c0ef4bae806203f92f6e69caeb6da1782061e62a
Author: Amar <amarhadziahmetovik@live.com>
Date:   Sat Apr 11 17:29:32 2020 +0200

    lab points variable added

commit d12c27b6893dbe78690e23aaf2f192557b9302ba
Author: Amar <amarhadziahmetovik@live.com>
Date:   Sat Apr 11 16:20:49 2020 +0200

    students.csv added

commit 6f18e96cb4179baae3692013b3d210d5d716c9cc
Author: Stefan Andonov <stefan5andonov@yahoo.com>
Date:   Thu Mar 5 20:32:46 2020 +0100

    Initial commit
