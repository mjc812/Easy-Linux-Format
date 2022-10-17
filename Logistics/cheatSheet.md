# ELF Cheat Sheet

A reference sheet for new users to ELF.

# Object Types

In ELF, you can use variables to store data values. There are different **types** of variables. 

## Folder

A directory located on your computer where files live

## File

Think — a word document, a picture, a movie, a shell script file, and on and on and on! As long as it can fit in a folder then you’re good!

## Files

A type to store a list of files. 

<aside>
💡 A folder/file/files variable is denoted with the **folder,  file, or files** keyword ahead of the name you give it.

```reason
**folder** folderName ...
**file** fileName ...
**files** files ...
```

</aside>

# Actions

These are the actions that you can perform on your variables and objects. You are able to **set your root path, assign variables**, and perform **commands** to modify your files

---

### Set Root Path

<aside>
💡 Before doing anything in ELF, you need to specify a root path you want to work out of

</aside>

**FORMAT:**

```bash
path = get path /home/this/is/your/path;
```

---

## Assignment:

These are ways to assign values to variables

### Get

Use the assignment operator ( `=` ) to assign an object to your variable. Use `get` with the **object type** and the [**assignment filtering](https://www.notion.so/ELF-Cheat-Sheet-5499fa84b8b5460e991a75b3d6f95dfc)** to specify the object(s) to retrieve. 

In the example below, we assign the file whose file name is “Homework.docx” to the `file` variable called **fileA**

**Examples:**

```markdown
file fileA = **get** **file** where name is Homework.docx;
```

Some examples for all object types: 

```yaml
**folder** yourFolder = **get** **folder** where name is CoolFolder;
**files** filesList = **get all** **files** in yourFolder;
**file** yourFile = **get file** at path /this/is/a/path;
```

**Recursively**
Recursively is a special keyword you can place on a `get all files` command that tells us to check every folder within a folder for the file you’re wanting to get. If you don’t use this keyword we will only search the very first level of the folder for your file.

```markdown
file fileA = get file **recursively** where name contains UBC;
folder folderA = get folder **recursively** where name prefix My;
files listA = get all files **recursively** where name is Brandon Symmers;
```

### Assignment Filtering

You can get an object based on these criteria:

- **name**
- **owned by**
- **date modified**
- **in folder**
- **at path**

<aside>
💡 For `file` and `folder` types, if multiple items match the filtering criteria, the first match will be returned

</aside>

To filter which files you receive, specify the `where` keyword

`where` is followed by one of:

1. **`name`**

This is used to filter based on the file/folder name

You must follow `name` with either:

- `is`
- `contains`
- `prefix`
- `suffix`

```reason
file fileA = get file where name **is** Harry Kane;
file fileB = get file where name **contains** Kane;
folder folderA = get folder where name **prefix** Harry Kane;
folder folderB = get folder where name **suffix** Harry Kane;
```

1. `**owned by**`

This is used to filter based on the user who owns the file or directory

`owned by` is followed by the name of a user

```yaml
files harryFiles = get all files where **modified by** hkane;
```

1. **`date modified`**

This is used to filter based on the date the file/folder was last modified

You must follow the `date modified` with either:

- `before`
- `on`
- `after`
- Then you end the statement with the date for which you are filtering on
- The format is `YYYY-MM-DD`

```yaml
files fileA = get all files where date **modified** **before** 2020-03-22;
files fileA = get all files where date **modified** **on** 2020-03-22;
files fileA = get all files where date **modified** **after** 2020-03-22;
```

1. **`in folder`**

This is used to retrieve an object of type `files` that live in a `folder` variable

Follow `in folder` with the name of your **folder** variable 

```yaml
folder myFolder = get folder where name is MyFolder;
files myFiles = get all files where **in folder myFolder**;
```

1. `**at path**`

This is used to retrieve an object at a specified path

Follow `at path` with your relative path (starting with ‘/’)

```yaml
file fileA = get file **at path** /School/homework.docx;
```

---

## Commands

These are the commands you can use to modify your files. You can **rename, delete, copy, or move** files and folders.

### Rename

Use this when you want to change the name of a single file or a folder.

In the example below, we rename the file assigned to  `yourFileName` to the name “new_file_name.txt”

```markdown
file yourFileName = get file where name is file_name.txt;
**rename** yourFileName as new_file_name.txt;
```

### Delete

Use this when you want to delete your files!

```reason
**delete** yourFileVariable;
**delete** yourFolderVariable;
**delete** all from yourFolderVariable;
```

### Copy

Use this when you want to copy your files!

```markdown
**copy** yourFileVariable to yourOtherFolderVariable;
**copy** yourFolderVariable to yourOtherFolderVariable;
**copy** all from yourFilesVariable to yourOtherFolderVariable;
```

### Move

Use this when you want to move your files!

```markdown
**move** yourFileVariable to yourOtherFolderVariable;
**move** yourFolderVariable to yourOtherFolderVariable;
**move** all from yourFilesVariable to yourOtherFolderVariable;
```

### Command Filtering

Only do the specified command if a certain condition is met

You can filter based on: 

- **name**
- **owned by**
- **date modified**

**To filter, use the keyword `if`**

`if` must be followed by one of:

1. `**name**`
    - you must follow `name` with one of:
        - `contains`
        - `prefix`
        - `suffix`
    - then input the name you wish to filter on
    
    ```markdown
    move fileA to folderA if **name is** UBC;
    move fileA to folderA if **name contains** UBC;
    move fileA to folderA if **name prefix** UBC;
    move fileA to folderA if **name suffix** UBC;
    ```
    

1. `**owned by**` then input the user to filter on
    
    ```yaml
    move fileA to folderA if **owned by** John Doe;
    ```
    
2. `**date modified**` then input the date and range to filter on
    
    ```yaml
    move fileB to folderB if **date modified** before 2022-02-10;
    ```
    

> For more examples of filtering see [Assignment Filtering](https://www.notion.so/ELF-Cheat-Sheet-5499fa84b8b5460e991a75b3d6f95dfc)
> 

**Conjoined conditions** 
The `**AND**` keyword can be used to specify multiple conditions. 
In the below example, we will only move files in `myFiles` to `folderA` if the file contains “UBC” in their name **and** if they have been modified since 2021-11-22. 

```yaml
move all from myFiles to folderA if name contains UBC**,** **AND** date ****modified after 2021-11-22;
```
