@echo off
setlocal

:: Verificar si hay cambios
git status --porcelain > nul
if %ERRORLEVEL% neq 0 (
    echo Error al verificar el estado del repositorio.
    exit /b 1
)

:: Verificar si hay cambios para commitear
set "changes=false"
for /f "tokens=1" %%A in ('git status --porcelain') do (
    set "changes=true"
    goto :foundChanges
)

echo No hay cambios para commit.
goto :end

:foundChanges
:: Solicitar mensaje de commit
set /p commitMessage=Introduce el mensaje de commit: 

:: Verificar si el mensaje está vacío
if "%commitMessage%"=="" (
    echo El mensaje de commit no puede estar vacío.
    exit /b 1
)

:: Añadir todos los cambios
git add .

:: Realizar commit
git commit -m "%commitMessage%"

:: Hacer push al repositorio
git push origin main

:end
:: Fin del script
endlocal
