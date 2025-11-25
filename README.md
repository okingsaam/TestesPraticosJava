# ProgramaMedia.java — Aulas Práticas de IA

Propósito
- Repositório usado em aulas práticas de Inteligência Artificial para mostrar programas Java simples que servem como pontos de partida para exercícios (média, idade, lógicas e heurísticas).

Conteúdo principal
- src/programamedia/ProgramaMedia.java — (principal) exemplo de cálculo de média e entrada do usuário.
- src/programaidade/ProgramaIdade.java — exemplo simples para calcular idade e demonstrar estruturas condicionais.

Como compilar e executar (Windows PowerShell)
1. Abra PowerShell no diretório raiz do repositório (onde está este README).
2. Compile os arquivos Java:

   javac -d out src\programamedia\ProgramaMedia.java src\programaidade\ProgramaIdade.java

3. Execute o programa principal (ajuste a classe conforme o seu arquivo principal):

   java -cp out programamedia.ProgramaMedia

Dicas rápidas
- Se receber erros de "package" ou "class not found", verifique se os arquivos estão nas pastas corretas e que o package no topo do arquivo coincide com a estrutura de pastas.
- Para recompilar tudo: remova/limpe a pasta `out` e rode o comando `javac` novamente.

Exercícios práticos sugeridos (aulas)
- Adapte `ProgramaMedia` para ler várias notas e calcular média ponderada.
- Acrescente validação de entrada (tratamento de exceções) e testes simples.
- Implemente regras para aprovar/reprovar com mensagens explicativas (simples sistema especialista).
- Colete entradas do usuário em um CSV e calcule estatísticas básicas (média, mediana, desvio).
- Compare heurísticas simples (por exemplo, média simples vs. média ponderada) e apresente resultados.

Extensões para tópicos de IA
- Transforme as regras em um sistema baseado em pontos (scoring) e experimente limiares.
- Integre uma biblioteca de ML Java (por ex. Weka) para treinar um modelo simples com exemplos coletados.
- Adicione um modo de simulação para testar políticas/heurísticas com dados sintéticos.

Contribuições e troubleshooting
- Abra issues para problemas ou sugestões e envie pull requests com mudanças pequenas e explicativas.
- Informe o Java JDK usado (versão) quando relatar problemas.

Boa aula! Use este repositório como ponto de partida para atividades práticas e evolua os exemplos conforme a turma progredir.
