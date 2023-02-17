# Tips on how to pass the CKA

## Define Aliases in bash and configure vim

```
$cat ~/.vimrc

set tabstop=2 softtabstop=2 shiftwidth=2
set expandtab
set number ruler
set autoindent smartindent
syntax enable
filetype plugin indent on
```

```
$cat ~/.bashrc

export now="--force --grace-period=0"
export DRY="--dry-run=client -o yaml"
alias k="kubectl"
```

## use kubectl imperative

use ```kubectl run nginx --image=nginx $DRY > starting_point.yaml```
to generate a valid yaml file. Continue from that point.

## kubectl help

use the help function of kubectl e.g. kubectl run --help 

## kubectl explain

use the explain verb of kubectl for a complete definition of the
object structurea. this is way more effectivce than the online documentation

## 
