# openLCA formula interpreter

This is the formula interpreter of openLCA. The formula parser
is generated from the grammar file
([FormulaParser.jj](./src/main/java/org/openlca/expressions/FormulaParser.jj))
using [JavaCC](https://javacc.org/). The last version was generated with
JavaCC 5.0 (see the `generate_parser.bat` script).

## Usage

Add this dependency to your project:

```xml
<dependency>
  <groupId>org.openlca</groupId>
  <artifactId>olca-formula</artifactId>
  <version>2.0.0</version>
</dependency>
```

See the tests for examples how the interpreter can be used.
