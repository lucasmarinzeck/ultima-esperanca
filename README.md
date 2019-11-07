## ultima-esperanca
# Comandos git
-----------------------------
	ANTES DE TUDO
-----------------------------
(Sempre antes de começar a mexer em alguma coisa)
Isso sincroniza as minhas mudanças na sua maquina, ai não da conflito de mexer nas mesmas coisas
git fetch --all 
git merge upstream/master-dev master-dev

-----------------------
git status (vê o status das suas alterações, vermelho foi modificado)
git add -A (Empacota todas as mudanças feitas, verde foi empacotado)
git commit -m 'Mensagem qualquer' (salva as mudanças feitas, apenas as que estão verdes)
git push --set-upstrem origin master-dev (Envia as mudanças para a sua conta no GITHUB)
