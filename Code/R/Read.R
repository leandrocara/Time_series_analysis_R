#Leitura de dados em arquivos#

#Leitura do arquivo .txt e armazenamento do conteúdo em um array#
Read_txt<-function(name,column){
  data = read.table(name, stringsAsFactors=FALSE, fileEncoding="latin1")
  data = data[,column]
  if(mode(data)=="character"){
    data = type.convert(data)
  }
  data = na.omit(data)
  return(data)
}

Read_txt2<-function(column){
  data = read.table(file.choose())
  data = data[,column]
  data = na.omit(data)
  return(data)
}

#Leitura do arquivo .csv e armazenamento do conteúdo em um array#
Read_csv<-function(column,separador=";"){
  data=read.csv(file.choose(), stringsAsFactors=T, fileEncoding="latin1",sep=separador)
  data = data[,column]
  if(mode(data)=="character"){
    data = type.convert(data)
  }
  data = na.omit(data)
  return(data)
}
