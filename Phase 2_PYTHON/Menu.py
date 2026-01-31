import qrcode
import os
print(os.getcwd())

# Replace this with your actual URL
menu_url = "https://youtu.be/oWwxXexN_U4?si=Z6J23AjOBCE2miD9"

# Create QR code object
qr = qrcode.QRCode(
    version=1,
    error_correction=qrcode.constants.ERROR_CORRECT_L,
    box_size=10,
    border=4,
)

qr.add_data(menu_url)
qr.make(fit=True)

# Create and save the QR code image
img = qr.make_image(fill_color="black", back_color="white")
img.save("C:\\Users\\DELL\\Desktop\\Prank1.png")

print("QR code generated and saved as prank1.png")
