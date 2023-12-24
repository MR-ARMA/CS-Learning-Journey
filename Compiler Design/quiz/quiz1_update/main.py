from antlr4 import *
from operationLexer import operationLexer
from operationParser import operationParser
   
def main():
    # Create a stream from the input
    input_data = "your_input_string"
    input_stream = InputStream(input_data)

   
    # Create an instance of the lexer
    lexer = operationLexer(input_stream)
  
    # Create a stream of tokens produced by the lexer
    stream = CommonTokenStream(lexer)
   
    # Create an instance of the parser
    parser = operationParser(stream)
   
    # Parse the input and get the parse tree
    tree = parser.start()  # replace 'start' with the name of the start rule in your grammar
   
    # Print the parse tree (for debugging purposes)
    print(tree.toStringTree(recog=parser))
   
if __name__ == '__main__':
    main()
