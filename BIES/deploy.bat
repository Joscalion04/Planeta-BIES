@echo off
setlocal

:: Solicitar mensaje de commit
set /p commitMessage=Introduce el mensaje de commit: 

:: Añadir todos los cambios
git add .

:: Realizar commit
git commit -m "%commitMessage%"

:: Hacer push al repositorio
git push origin main

:: Fin del script
endlocal
