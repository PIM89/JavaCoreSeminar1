FROM bellsoft/liberica-openjdk-alpine

COPY ./src ./src

CMD javadoc -d doc src/*