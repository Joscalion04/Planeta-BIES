@echo off
setlocal enabledelayedexpansion

echo.
echo ===========================================================
echo.
echo  Verificando cambios en el repositorio...
echo.
echo ===========================================================
echo.

git status --porcelain > nul
if %ERRORLEVEL% neq 0 (
    echo.
    echo  Error al verificar el estado del repositorio.
    echo.
    echo ===========================================================
    echo.
    exit /b 1
)

:: Verificar si hay cambios para commitear
set "changes=false"
for /f "tokens=1" %%A in ('git status --porcelain') do (
    set "changes=true"
    goto :foundChanges
)

echo.
echo  No hay cambios para commit.
echo.
echo ===========================================================
echo.
goto :end

:foundChanges
echo.
echo  Se encontraron cambios.
echo.
echo ===========================================================
echo.

:: Preguntar al usuario si desea hacer commit y push
set /p confirm="Deseas hacer commit y push al repositorio? (y/n): "
if /i "%confirm%" neq "y" (
    echo ===========================================================
    echo.
    echo  Cancelado por el usuario.
    echo.
    echo ===========================================================
    echo.
    goto :end
)

:: Solicitar mensaje de commit
:askCommitMessage
echo.
echo  Introduce el mensaje de commit:
echo.
echo ===========================================================
echo.
set /p commitMessage=

if "%commitMessage%"=="" (
    echo El mensaje de commit no puede estar vacío.
    goto :askCommitMessage
)

:: Añadir todos los cambios
echo.
echo  Agregando cambios...
echo.
echo ===========================================================
echo.

git add .
if %ERRORLEVEL% neq 0 (
    echo.
    echo  Error al agregar los cambios.
    echo.
    echo ===========================================================
    echo.
    exit /b 1
)

:: Realizar commit
echo.
echo  Realizando commit...
echo.
echo ===========================================================
echo.

git commit -m "%commitMessage%"
if %ERRORLEVEL% neq 0 (
    echo.
    echo  Error al realizar el commit.
    echo.
    echo ===========================================================
    echo.
    exit /b 1
)

:: Hacer push al repositorio
echo.
echo  Haciendo push al repositorio...
echo.
echo ===========================================================
echo.

git push origin main
if %ERRORLEVEL% neq 0 (
    echo.
    echo  Error al hacer push.
    echo.
    echo ===========================================================
    echo.
    exit /b 1
)

echo.
echo  ¡Operación completada exitosamente!
echo.
echo ===========================================================
echo.

:end
:: Fin del script
endlocal
