import qrcode

data = "https://www.instagram.com/p/C3mbZxcNdn9fRrhX9NU-iDBuVIowa_7zPJNKkU0/?igsh=MTM0Z3hxZTh4bWtteQ=="

qr = qrcode.QRCode(
    version=2,
    error_correction=qrcode.constants.ERROR_CORRECT_L,
    box_size=10,
    border=4,
)

qr.add_data(data)
qr.make(fit=True)

img = qr.make_image(fill_color="black", back_color="white")

# Use raw string or double backslashes for Windows paths
save_path = r"D:\ prachi.png"
img.save(save_path)

print(f"QR code saved as {save_path}")
