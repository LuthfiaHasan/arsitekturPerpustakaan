$services = @("eureka-server", "api-gateway", "anggota", "buku", "peminjaman", "pengembalian")
foreach ($service in $services) {
    Write-Host "Building $service..."
    Push-Location $service
    cmd /c mvnw.cmd clean package -DskipTests
    if ($LASTEXITCODE -ne 0) {
        Write-Error "Build failed for $service"
        exit 1
    }
    Pop-Location
}
Write-Host "All services built successfully."
