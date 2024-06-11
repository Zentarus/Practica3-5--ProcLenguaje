from reportlab.lib.pagesizes import letter
from reportlab.pdfgen import canvas

def convert_text_to_pdf(input_file, output_file):
    c = canvas.Canvas(output_file, pagesize=letter)
    width, height = letter

    with open(input_file, 'r', encoding='utf-8') as file:
        text = file.readlines()

    y = height - 40
    for line in text:
        c.drawString(40, y, line.strip())
        y -= 12
        if y < 40:
            c.showPage()
            y = height - 40

    c.save()

input_file = './traductor/alike.jj'
output_file = './pdfs/alike.pdf'
convert_text_to_pdf(input_file, output_file)

convert_text_to_pdf("./lib/attributes/Attributes.java", "./pdfs/attributes.pdf")

convert_text_to_pdf("./lib/symbolTable/Symbol.java", "./pdfs/symbol.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolArray.java", "./pdfs/symbolArray.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolBool.java", "./pdfs/symbolBool.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolChar.java", "./pdfs/symbolChar.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolFunction.java", "./pdfs/symbolFunction.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolInt.java", "./pdfs/symbolInt.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolProcedure.java", "./pdfs/symbolProcedure.pdf")

convert_text_to_pdf("./lib/symbolTable/SymbolTable.java", "./pdfs/symbolTable.pdf")
