CREATE TABLE estados
	(codestado integer PRIMARY KEY,
	nomeestado char(2) NOT NULL);

CREATE TABLE estagios
	(codestagio integer PRIMARY KEY,
	nivelestagio char(40) NOT NULL);

CREATE TABLE executores
	(codexecutor integer PRIMARY KEY,
	nomeexecutor char(40) NOT NULL);

CREATE TABLE municipios
	(codmunicipio integer PRIMARY KEY,
	nomemunicipio char(40) NOT NULL,
	codestado integer REFERENCES estados(codEstado));
	
CREATE TABLE obras
	(codobra integer PRIMARY KEY,
	empreendimento char(300) NOT NULL,
	codmunicipio integer REFERENCES municipios(codMunicipio),
	codexecutor integer REFERENCES executores(codExecutor),
	codestagio integer REFERENCES estagios(codEstagio));