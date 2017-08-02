#Option = 1 -> Calcula a Entropia# 
#Option != 1 -> Calcula a Entropia normalizada#

shannonEntropy <- function(probability){
  h <- probability * log(probability)
  h[is.nan(h)] <- 0
  return (-sum(h))
}

shannonEntropyNormalized <- function(probability){
  return(shannonEntropy(probability)/log(length(probability)))
}

tsallisEntropy <- function(probability,q,option=0){  
  entropy = sum(probability^q)
  entropy = (1 - entropy)*(1/(q - 1))
  if(option){
    return (entropy)
  }
  else{
    ent_max = (1 - (length(probability)^(1 - q)))/(q - 1)
    return( entropy/ent_max)
  }
}

renyiEntropy <- function(probability,q,option=0){
  entropy = sum(probability^q)
  entropy = log(entropy)
  entropy = entropy * (1/(1 - q))
  if(option){
    return (entropy)
  }
  else{
    return ( entropy/log(length(probability)))
  }
}

  
  
  
  
  
