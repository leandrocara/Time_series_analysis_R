equalitiesValues<-function(series){
  aux = duplicated(series)
  answer = length(aux[aux==TRUE])
  answer = (answer*100)/length(series)
  cat("Percent of repeated values: ",answer,"\n")
} 

PMEUnidimensional<-function(probability){
  pme = (-1)*log(max(probability))
  pme
}

PMEBidimensional<-function(image,dimX,dimY,delX,delY){
  probability <- distributionImage(image,dimX,dimY,delX,delY)
  pme = (-1)*log(max(probability))
  pme
}