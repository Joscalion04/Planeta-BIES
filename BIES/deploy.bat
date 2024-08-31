@echo off
setlocal

:: Verificar si hay cambios
git status --porcelain > nul
if %ERRORLEVEL% neq 0 (
    echo Error al verificar el estado del repositorio.
    exit /b 1
)

set /p commitMessage=Introduce el mensaje de commit: 

:: Verificar si hay cambios para commitear
for /f "tokens=1" %%A in ('git status --porcelain') do (
    set "changes=true"
    goto :foundChanges
)

echo No hay cambios para commit.
goto :end

:foundChanges
:: Añadir todos los cambios
git add .

:: Realizar commit
git commit -m "%commitMessage%"

:: Hacer push al repositorio
git push origin main

:end
:: Fin del script
endlocal
